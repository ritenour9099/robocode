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

        ColorFunction(String color){

                // i think this is how we get the color from th the light sensor
                sensorRGB = hardwareMap.colorSensor.get("color");


