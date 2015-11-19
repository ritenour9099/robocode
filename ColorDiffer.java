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
import com.qualcomm.robotcore.hardware.DcMotor;
// other things to import depends on decisions later

//extends LinearOpMode
public class ColorDiffer extends OpMode{

DcMotor LeftFront;
DcMotor RightFront;
DcMotor LeftBack;
DcMotor RightBack;

ColorSensor sensorRGB;
DeviceInterfaceModule cdim;
// we assume that the LED pin of the RGB sensor is connected to
// digital port 5 (zero indexed). i think this is required
static final int LED_CHANNEL = 5;
public static string Opmode;
        
        public void init()
        {
                LeftFront = hardwaretMap.dcMotor.get("motor_1");
                RightFront = hardwareMap.dcMotor.get("motor_2");
                LeftBack = hardwareMap.dcMotor.get("motor_3");
                RightBack = hardwareMap.dcMotor.get("motor_4");

        }
        
        blue_botton(float b = sensorRGB.blue(),float r = sensorRGB.red())
        {
                // not complete. I still need to figure out how to check the values
                if(b > 150 && r < 25) 
                {
                        
                }
                
                else if(r > 150 && b < 25)
                {
                        
                }
                
                else
                {
                        // here is where we will print an error to the system log
                }
        }

        red_botton(float b = sensorRGB.blue(),float r = sensorRGB.red())
        {
                // not complete. I still need to figure out how to check the values
                if(b > 150 && r < 25) 
                {
                        
                }
                
                else if(r > 150 && b < 25)
                {
                        
                }
                
                else
                {
                        // here is where we will print an error to the system log
                }
        }

        ColorFunction(){

                // i think this is how we get the color from the light sensor
                sensorRGB = hardwareMap.colorSensor.get("color");
                
                // this may not work
                float red = sensorRGB.red();
                float green = sensorRGB.green();
                float blue = sensorRGB.blue();

                // i still need to pass the color variables to the functions
                if(Opmode == "BLUE") 
                {
                        blue_botton(blue,red);
                }
                
                else if(Opmode == "RED")
                {
                        red_botton(blue,red);
                }
                
                else
                {
                        // here is where we will print an error to the system log
                }
        }
}
