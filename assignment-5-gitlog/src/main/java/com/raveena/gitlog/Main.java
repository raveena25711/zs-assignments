package com.raveena.gitlog;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        try {
            File file = new File("./assignment-5-gitlog/data/log.txt");
            if (!file.exists()) {
                throw new FileNotExistsException("file doesn't exit");
            }
        } catch (FileNotExistsException e) {
            e.printStackTrace();
        }
        try {
            Scanner scanner = new Scanner(new File("./assignment-5-gitlog/data/log.txt"));

            while (scanner.hasNextLine()) {
                String commit = scanner.nextLine();
                if (commit.contains("commit")) {
                    String author = scanner.nextLine();
                    String date = scanner.nextLine();
                    scanner.nextLine();
                    String message = scanner.nextLine();
                    scanner.nextLine();
                    if (!author.contains("Author:") || !date.contains("Date:")) {
                        throw new FormatException("exception occured");
                    }
                }
            }
        }catch (FormatException e) {
            e.printStackTrace();
        }
        try {
            Scanner scanner = new Scanner(new File("./assignment-5-gitlog/data/log.txt"));

            while (scanner.hasNextLine()) {
                String commit = scanner.nextLine();
                String author = scanner.nextLine();
                String date = scanner.nextLine();
                if ((author.length()<47) || commit.length()<40 || date.length()<37) {
                    throw new IncompleteException("has incomplete information");
                }
                scanner.nextLine();
                String message = scanner.nextLine();
                scanner.nextLine();
            }
        }
        catch(IncompleteException | FileNotFoundException e) {
            e.printStackTrace();
        }

       List<LogDetails> details = readLogFile();
        Map<String, Integer> problem1 = problem1(details);
        System.out.println(problem1);
        Map<String,Map<String, Integer>> problem2=problem2(details);
        System.out.println(problem2);
        problem3try3(details);
    }

    private static Map<String, Integer> problem1(List<LogDetails> details) throws ParseException {
        Map<String, Integer> count = new HashMap<>();
        for (LogDetails log : details) {
            String specificDate = "2 Feb 2022";
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
            Date strDate = formatter.parse(specificDate);
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(strDate);
            String everyDate = log.getDate();
            SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");
            Date Date = format.parse(everyDate);
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(Date);
            if (cal2.getTime().after(cal1.getTime()) || cal2.getTime().equals(cal1.getTime())) {
                if (count.containsKey(log.getAuthor())) {
                    count.put(log.getAuthor(), count.get(log.getAuthor()) + 1);
                } else {
                    count.put(log.getAuthor(), 1);
                }
            }
        }
        return count;
    }

    private static Map<String,Map<String, Integer>> problem2(List<LogDetails> details) throws ParseException {
        Map<String,Map<String, Integer>>map2=new HashMap<>();
        String specificDate = "2 Feb 2022";
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
        Date strDate = formatter.parse(specificDate);
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(strDate);
        for (LogDetails log : details) {
            String everyDate = log.getDate();
            SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");
            Date Date = format.parse(everyDate);
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(Date);
            if (cal2.after(cal1) || cal2.equals(cal1)) {
                if(map2.containsKey(log.getAuthor())){
                    Map<String, Integer> map1=map2.get(log.getAuthor());
                    if(map1.containsKey(log.getDate())){
                        map1.put(log.getDate(), map1.get(log.getDate())+1);
                        map2.put(log.getAuthor(), map1);
                    }else{
                        map1.put(log.getDate(), 1);
                        map2.put(log.getAuthor(), map1);
                    }

                }else{
                    Map<String, Integer> map1=new HashMap<>();
                    map1.put(log.getDate(), 1);
                   map2.put(log.getAuthor(), map1);
                }
            }
        }
        return map2;
    }

    public static void problem3try3(List<LogDetails> details) throws ParseException {
        Map<String, List<String>> resultedMap=new HashMap<>();
        for(LogDetails log:details){

                if (!resultedMap.containsKey(log.getAuthor())) {
                    resultedMap.put(log.getAuthor(), new ArrayList<String>());
                }
            resultedMap.get(log.getAuthor()).add(log.getDate());
        }
        List<String> authorName=new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : resultedMap.entrySet()) {
            String key = entry.getKey();
            String date="4 Feb 2022";
            for (String value : entry.getValue()) {
               String startingDate=date;
               String endDate=value;
                SimpleDateFormat format= new SimpleDateFormat("dd MMM yyyy");
                Date date1 = format.parse(startingDate);
                Date date2 = format.parse(endDate);
                long differenceInTime = date2.getTime() - date1.getTime();
                long differenceInDays = (differenceInTime / (1000 * 60 * 60 * 24));
                if(differenceInDays>=2){
                    authorName.add(key);
                }
            }
        }
        System.out.println(authorName);

    }

    public static List<LogDetails> readLogFile()  {
        List<LogDetails> logDetails = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new File("./assignment-5-gitlog/data/log.txt"));
        while (scanner.hasNextLine()) {
                LogDetails logDetailsModel = new LogDetails();
                String commits = scanner.nextLine();
                String[] authors = scanner.nextLine().split("\\s");
                String author= authors[1];
                String[] date = scanner.nextLine().split("\\s");
                String dateAsString=date[5]+" "+date[4]+" "+date[7];
                scanner.nextLine();
                String message = scanner.nextLine();
                scanner.nextLine();
                logDetailsModel.setAuthor(author);
                logDetailsModel.setDate(dateAsString);
                logDetailsModel.setCommit(commits);
                logDetailsModel.setMessage(message);
                logDetails.add(logDetailsModel);
            }
        }catch (Exception e) {
        }
        return logDetails;
    }
   }
