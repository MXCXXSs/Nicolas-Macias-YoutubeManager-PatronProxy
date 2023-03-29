/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxyyoutube;

/**
 *
 * @author nicol
 */
public abstract class CachedYouTubeClass implements  ThirdPartyYouTubeLib {

    private ThirdPartyYouTubeLib thirdPartyYouTubeLib;
    
    public void service(){
        if(thirdPartyYouTubeLib==null){
            thirdPartyYouTubeLib =new ThirdPartyYouTubeClassImpl();
            thirdPartyYouTubeLib.listVideos();
            thirdPartyYouTubeLib.getVideoInfo(01);
            thirdPartyYouTubeLib.downloadVideo(01);
        }
    }

    private static class ThirdPartyYouTubeClassImpl extends ThirdPartyYouTubeClass {

        public ThirdPartyYouTubeClassImpl() {
        }

        @Override
        public void listVideos() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void getVideoInfo(int idVideo) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void downloadVideo(int idVideo) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

}
