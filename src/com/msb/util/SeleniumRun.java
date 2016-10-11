package com.msb.util;

import java.io.IOException;
import java.util.Date;

import org.junit.runner.JUnitCore;
 
import com.msb.account.*;
import com.msb.admin.dashboard.DashboardProject;
import com.msb.dashboard.RequirementDashboard;
import com.msb.home.EditProfile;
import com.msb.home.TaskDetails;
import com.msb.home.Timesheet;
import com.msb.login.*;
import com.msb.utilities.*;


import org.junit.runner.Result;

public class SeleniumRun {
	 
	public static void main(String args[]) throws IOException {
		try {
			MSBUtils.writeLog("Start Time : " + new Date());
			JUnitCore junit = new JUnitCore();
                        
			
			junit.run(AccountSearch.class);

// 		
			
			MSBUtils.writeLog("End Time : " + new Date());
			MSBUtils.displayTableReport();
			MSBUtils.browserClose();

			// MSBUtils.sendMail();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
