package com.example.cosmas.modelviewcontrollerdemo;
import java.util.ArrayList;
/**
 * Created by cosmas on 3/5/2016.
 */
public class Model {

    private ArrayList<String>stringList;
    {
        stringList=new ArrayList<String>();
    }

    public void addString(String str)
    {
      stringList.add(str);
    }

    public String getList()
    {
        String retVal = new String();
        for (String str : stringList)
            retVal=String.format("%s %s",retVal,str);
        return retVal;
    }
}
