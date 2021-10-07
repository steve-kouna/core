/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.directmedia.onlinestore.core.entity;

import java.util.HashSet;

/**
 *
 * @author steve-kouna
 */
public class Catalogue {

    public Catalogue() {
    }
    
    public static void listOfWorks(Work work){
        HashSet<Work> hset = new HashSet();
        hset.add(work);
        
        for (Work work1 : hset) {
            System.out.println(work1.getTitle() + "( " + work1.getRelease() + " )");
        }
    }
}
