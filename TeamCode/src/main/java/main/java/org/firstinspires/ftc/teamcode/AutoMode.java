package main.java.org.firstinspires.ftc.teamcode;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
@Autonomous(name = "The Auto Mode")
public class AutoMode extends LinearOpMode {
    private DcMotor upDrive = null;
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftDrive= null;
    private DcMotor rightDrive = null;
   //private Servo servo = null;
    ColorSensor colorSensorLeft;    // Hardware Device Object
    ColorSensor colorSensorRight;
    @Override
    public void runOpMode() throws InterruptedException {
        // get a reference to the RelativeLayout so we can change the background
        // color of the Robot Controller app to match the hue detected by the RGB sensor.
        int relativeLayoutId = hardwareMap.appContext.getResources().getIdentifier("RelativeLayout", "id", hardwareMap.appContext.getPackageName());
        final View relativeLayout = ((Activity) hardwareMap.appContext).findViewById(relativeLayoutId);

        waitForStart();
        //Init of robot maps
        upDrive = hardwareMap.get(DcMotor.class, "up_drive");
        leftDrive = hardwareMap.get(DcMotor.class,"left_drive");
        rightDrive = hardwareMap.get(DcMotor.class,"right_drive");
        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);

        // get a reference to our ColorSensor object.
        colorSensorLeft = hardwareMap.get(ColorSensor.class, "sensor_color_left");
        colorSensorRight = hardwareMap.get(ColorSensor.class, "sensor_color_right");
        colorSensorLeft.enableLed(true);
        colorSensorRight.enableLed(true);
        //Arm extension
        runtime.reset();
        upDrive.setPower(-.35);
        while(opModeIsActive()&& runtime.seconds()<1)
        {
            //Party
        }
        runtime.reset();
        upDrive.setPower(0);
        while(opModeIsActive()&& runtime.seconds()<4)
        {
            //Party
        }
        runtime.reset();
        upDrive.setPower(-.5);
        while(opModeIsActive()&& runtime.seconds()<1.5) {

        }
        upDrive.setPower(0);
    //backward
        runtime.reset();
        leftDrive.setPower(.5);
        rightDrive.setPower(.5);
        while (opModeIsActive() && runtime.seconds()<.15)
        {
            //party
        }
        leftDrive.setPower(0);
        rightDrive.setPower(0);
    //arm compression
        runtime.reset();
        upDrive.setPower(.5);
        while(opModeIsActive()&& runtime.seconds()<2.7)
        {
            //Party
        }
        upDrive.setPower(0);
    //turn right
        runtime.reset();
        leftDrive.setPower(-.5);
        rightDrive.setPower(.5);
        while (opModeIsActive() && runtime.seconds()<0.7)
        {
            //party
        }
        leftDrive.setPower(0);
        rightDrive.setPower(0);
    //forward
        runtime.reset();
        leftDrive.setPower(-.5);
        rightDrive.setPower(-.5);
        while (opModeIsActive() && runtime.seconds()<0.775){

        }
        runtime.reset();
        leftDrive.setPower(0);
        rightDrive.setPower(0);
        while (opModeIsActive() && runtime.seconds()<1)
        {
            //party
        }
 /*       if (colorSensorLeft.alpha()-colorSensorRight.alpha()<=0.4*colorSensorLeft.alpha()){
            //backwards
            runtime.reset();
            leftDrive.setPower(.5);
            rightDrive.setPower(.5);
            while (opModeIsActive() && runtime.seconds()<.175)
            {
                //party
            }
            leftDrive.setPower(0);
            rightDrive.setPower(0);
            //turn left
            runtime.reset();
            leftDrive.setPower(.5);
            rightDrive.setPower(-.5);
            while (opModeIsActive() && runtime.seconds()<0.7)
            {
                //party
            }
            leftDrive.setPower(0);
            rightDrive.setPower(0);
            //forwards
            runtime.reset();
            leftDrive.setPower(-.5);
            rightDrive.setPower(-.5);
            while (opModeIsActive() && runtime.seconds()<1){

            }
            leftDrive.setPower(0);
            rightDrive.setPower(0);
            //turn right
            runtime.reset();
            leftDrive.setPower(-.5);
            rightDrive.setPower(.5);
            while (opModeIsActive() && runtime.seconds()<0.75)
            {
                //party
            }
            leftDrive.setPower(0);
            rightDrive.setPower(0);
            //forwards
            runtime.reset();
            leftDrive.setPower(-.5);
            rightDrive.setPower(-.5);
            while (opModeIsActive() && runtime.seconds()<0.75){

            }
            leftDrive.setPower(0);
            rightDrive.setPower(0);
        }
        telemetry.addData("Clear", colorSensorLeft.alpha());
        telemetry.update(); */
    }

}
