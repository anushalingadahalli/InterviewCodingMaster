package CodingMaster.Leetcode.Expedia;

import java.util.HashMap;

public class UniqueFileNames {
    public String[] getFolderNames(String[] names) {
     HashMap<String,Integer>namesList=new HashMap<>();
     for(int i=0;i<names.length;i++){
         int suffix=namesList.getOrDefault(names[i],0);
         String raw=names[i];
         if(suffix!=0){
             while(namesList.getOrDefault(names[i],0)!=0){
                 names[i]=raw+"("+suffix+")";
                 suffix++;
             }
             namesList.put(raw,suffix);
         }
         namesList.put(names[i],1);
     }
     return names;
    }

}
