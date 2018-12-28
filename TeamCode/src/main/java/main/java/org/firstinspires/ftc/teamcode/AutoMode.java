package main.java.org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
@Autonomous(name = "The Auto Mode")
public class AutoMode extends LinearOpMode {
    DcMotor upDrive = null;
    ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
    upDrive = hardwareMap.get(DcMotor.class, "up_drive");

    upDrive.setPower(.5);
    runtime.reset();
    while(opModeIsActive()&& runtime.seconds()<2)
    {
        //Party
    }
    upDrive.setPower(0);


    }
}
