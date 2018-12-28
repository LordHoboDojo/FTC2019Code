package main.java.org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
@Autonomous(name = "The Auto Mode")
public class AutoMode extends LinearOpMode {
    private DcMotor upDrive = null;
   private ElapsedTime runtime = new ElapsedTime();
   private DcMotor leftDrive= null;
   private DcMotor rightDrive = null;

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
    upDrive = hardwareMap.get(DcMotor.class, "up_drive");
    leftDrive = hardwareMap.get(DcMotor.class,"left_drive");
    rightDrive = hardwareMap.get(DcMotor.class,"right_drive");
    leftDrive.setDirection(DcMotor.Direction.FORWARD);
    rightDrive.setDirection(DcMotor.Direction.REVERSE);

    upDrive.setPower(-.5);
    runtime.reset();
    while(opModeIsActive()&& runtime.seconds()<3)
    {
        //Party
    }

    leftDrive.setPower(-.5);
    rightDrive.setPower(-.5);
    runtime.reset();
    while (opModeIsActive() && runtime.seconds()<2.5)
    {
        //party
    }

    }
}
