/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.directmedia.onlinestore.core;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

/**
 *
 * @author steve-kouna
 */
public class Startup {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Artist mainArtist = new Artist();
            mainArtist.setName("mainArtist" + i);

            Work work = new Work();
            work.setTitle("work" + i);
            work.setGenre("rap" + i);
            work.setRelease(1234 * i);
            work.setSummary("test " + i);
            work.setMainArtist(mainArtist);

            Catalogue.listOfWorks(work);
        }

    }
}
