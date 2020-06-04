/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author tiennh
 */
public class MainClass {
    public static void main(String[] args)
    {
        List<Integer> listInteger = new ArrayList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(1);

        System.out.println("List Integer: " + listInteger.toString());

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);
        setInteger.add(1);

        System.out.println("Set Integer: " + setInteger.toString());

        listInteger.addAll(setInteger);
        System.out.println("List Integer: " + listInteger.toString());
        
        setInteger.addAll(listInteger);
        System.out.println("Set Integer: " + setInteger.toString());

        listInteger.add(4);
        System.out.println("List Integer lastIndexOf(1): " + listInteger.lastIndexOf(1));
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("sv1", 2);
        map.put("sv2", 5);
        map.put("sv3", 7);
        System.out.println("Map: " + map.entrySet());
    }
}
