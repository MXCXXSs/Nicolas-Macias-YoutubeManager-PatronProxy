/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proxyyoutube;

/**
 *
 * @author nicol
 */
public abstract interface ThirdPartyYouTubeLib {

    public abstract void listVideos();
    public abstract void getVideoInfo(int idVideo);
    public abstract void downloadVideo(int idVideo);
    
}
