package com.example.fall2025;

import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;


public class CountLW {
    
    private String sentence;

    public CountLW(String sentence) {
        this.sentence = sentence;
    }
    
//    public  Map<String , Integer>  countWord(){
//        
//        Map<String , Integer>  wl = new HashMap<>();
//        StringTokenizer  tokenizer = new StringTokenizer(sentence) ;
//        while(tokenizer.hasMoreTokens()){
//            String word = tokenizer.nextToken();
//            wl.put(word, wl.getOrDefault(wl,0)+1);
//        }
//        return wl;
//       
//    }
    
    public Map<String, Integer>  countWords(){
        
        Map<String, Integer> kq = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(sentence);
     
        while(tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken();
            kq.put(word, kq.getOrDefault(word, 0) + 1);
        }
        return kq;
        
    }
    
      public Map<Character, Integer>  countLetter(){
          Map<Character, Integer> kq = new HashMap<>();
          for(char c: sentence.toCharArray()){
              if(Character.isLetter(c)){                
                  kq.put(c, kq.getOrDefault(c,0)+1);              
              }
          }         
          return kq;      
      }
    
    
//    public Map<Character, Integer> countLetters() {
//        HashMap<Character, Integer> letterCount = new HashMap<>();
//
//        for (char c : sentence.toLowerCase().toCharArray()) {
//            if (Character.isLetter(c)) {
//                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
//            }
//        }
//        return letterCount;
//    }
    
    
    public String convertToBinary(int n){
        
        StringBuilder kq = new StringBuilder();
        while(n>0){
            int d = n%2;
            kq.append(d);
            n=n/2;
        } 
        return kq.reverse().toString();     
        
    }
    
    public String convertToHexa(int n){
        
        StringBuilder kq = new StringBuilder();
        
        char[] digits = "0123456789ABCDEF".toCharArray();
        
        while(n>0){
            int sd = n%16;
            kq.append(digits[sd]);
            n=n/16;
        }
        
        return kq.reverse().toString();
        
        
        
    }
     
    
//    
//    public String convertToHexa(int n){
//         
//         StringBuilder kq = new StringBuilder();
//         char[] digits = "0123456789ABCDEF".toCharArray();       
//         while(n>0){
//             
//             int sd = n%16;
//             kq.append(digits[sd]);
//             n=n/16;
//         }
//         return kq.reverse().toString();
//
//     }

}
