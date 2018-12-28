package main.java.org.firstinspires.ftc.teamcode;
import com.qualcomm.hardware.lynx.LynxDcMotorController;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;
@TeleOp(name="The Mode", group="Linear Opmode")
public class Test extends LinearOpMode {
    private DcMotor leftDrive = null;
    private DcMotor rightDrive = null;
//    private Servo testServo = null;
    private DcMotor linearActuator = null;
    @Override
    public void runOpMode() throws InterruptedException {
        boolean right = false;
        boolean left = false;
        leftDrive  = hardwareMap.get(DcMotor.class, "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");
        //testServo = hardwareMap.get(Servo.class , "test_Servo");
        linearActuator = hardwareMap.get(DcMotor.class, "up_drive");
        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
        while (opModeIsActive()) {
//            double servoPos = testServo.getPosition();
//            telemetry.addData("Error: POPE nOt FoUnD", servoPos);
            telemetry.update();
            double leftPower;
            double rightPower;
            double upPower;
            double drive = gamepad1.left_stick_y*.5;
            double turn  =  -gamepad1.right_stick_x*.5;
            upPower = gamepad1.right_trigger-gamepad1.left_trigger;
//            right = gamepad1.a;
//            left = gamepad1.b;
//            if (right)
//            {
//                testServo.setPosition(testServo.getPosition()+.05);
//                delay();
//            }
//            if (left)
//            {
//                testServo.setPosition(testServo.getPosition()-.05);
//                delay();
//            }
            upPower = Range.clip(upPower,-1.0,1.0);
            leftPower    = Range.clip(drive+turn , -1.0, 1.0) ;
            rightPower   = Range.clip(drive-turn , -1.0, 1.0) ;
            leftDrive.setPower(leftPower);
            rightDrive.setPower(rightPower);
            linearActuator.setPower(upPower);
        }
    }

    private void delay() {
        for (int i =0;i <25;i ++)
        {
            for (int j=0; j< 100000;j++)
            {

            }
        }
    }
}
