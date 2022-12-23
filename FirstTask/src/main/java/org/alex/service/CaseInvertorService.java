package org.alex.service;

public class CaseInvertorService {
    public static String changeRegister(String inp_str)
    {
        if(inp_str.length() == 0){
            return "";
        }
        char[] ch = inp_str.toCharArray();
        for(int i = 0; i < ch.length; i++)
        {
            char c = ch[i];
            ch[i] = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        }
        return new String(ch);
    }
}
