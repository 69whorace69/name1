

package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Shreeyansh", group = "Test")
public class Example1 extends LinearOpMode {

    HardwarePushbot robot = new HardwarePushbot();
    double power = 0.5;

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        waitForStart();
        while (opModeIsActive()) {
            robot.leftDrive.setPower(power);
            robot.rightDrive.setPower(power);
        }
    }
}