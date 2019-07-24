package iitFirefox;


import iitFirefox.User.*;
import iitFirefox.login.*;
import org.junit.runner.JUnitCore;

import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class StartFirefox {
    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(A_LoginLogPass_Test1.class);
        System.out.println(result);



     /*    RunListener dfs = new RunListener();

       JUnitCore junit = new JUnitCore();
        Result result = junit.run(
                A_LoginLogPass_Test1.class,
                B_LoginCerts_Test2.class,
                C_ForgotPassword_Test3.class,
                D_ChooseRoleAndCabinet_Test4.class,
                E_ChangeParamMessage_Test5.class,
                G_ChangePassword_Tes7.class,
                H_ChangeRoles_Test8.class,
                I_ExitCabinet_Test9.class,
                J_ChangeStartTap_Test10.class,
                K_DownloadMaterial_Test11.class
        );
        dfs.testAssumptionFailure(A_LoginLogPass_Test1);
        System.out.println(result);*/

    }
}

