package com.qualcomm.ftcrobotcontroller.opmodes;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;

import com.qualcomm.ftccommon.DbgLog;
import com.qualcomm.ftcrobotcontroller.R;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DeviceInterfaceModule;
import com.qualcomm.robotcore.hardware.DigitalChannelController;
// other things to import depends on decisions later

//extends LinearOpMode
public class ColorDiffer {

ColorSensor sensorRGB;
DeviceInterfaceModule cdim;
string Opmode;

        ColorFunction(String color){

                // i think this is how we get the color from the light sensor
                sensorRGB = hardwareMap.colorSensor.get("color");
                
                // this may not work
                float red = sensorRGB.red();
                float green = sensorRGB.green();
                float blue = sensorRGB.blue();

                // not complete. I still need to figure out how to check the values
                if(blue > 150 && red < 25) 
                {
                        
                }
                
                else if(red > 150 && blue < 25)
                {
                        
                }
                
                else
                {
                        // here is where we will print an error to the system log
                }
                
        }
}
