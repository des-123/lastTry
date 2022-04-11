package com.company;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

public class musicthings {


    void playMusic(String musiclocationVIBES){

try{
    File musicFLIGHTpath = new File(musiclocationVIBES);

    if(musicFLIGHTpath.exists()){


        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicFLIGHTpath);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInput);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        
//when you want to pause the sound
        //JOptionPane.showMessageDialog(null,"press ok to pause");
       // long clipTimePosition123 = clip.getMicrosecondPosition();
        //clip.stop();

//when you want to resume the sound
        //JOptionPane.showMessageDialog(null,"press ok to resume");
        //clip.setMicrosecondPosition(clipTimePosition123);
        //clip.start();



        //stop the sound by pressing "ok"

        JOptionPane.showMessageDialog(null,"press ok to stop");

    }
        else{

            System.out.println("Error");
    }

}catch(Exception ex){

   ex.printStackTrace();

}

}
}

