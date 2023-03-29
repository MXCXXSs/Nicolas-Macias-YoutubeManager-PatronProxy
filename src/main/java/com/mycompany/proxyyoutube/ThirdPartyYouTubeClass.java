/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxyyoutube;

/**
 *
 * @author nicol
 */
public abstract class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{

    @Override
    public abstract void listVideos();
    @Override
    public abstract void getVideoInfo(int idVideo);
    @Override
    public abstract void downloadVideo(int idVideo);
}
