# Fuel Consumption

import java.util.*;
import java.lang.*;
import java.io.*;

public class FuelConsumption{
	public double maximalDistance(int[] velocities, int[] consumptions, int fuel){
		double min = Integer.MAX_VALUE;
		int ans = 0;
		for(int i=0;i<velocities.length;i++){
			double val = (double)consumptions[i]/velocities[i];
			if(val<min){
				min = val;
				ans = i;
			}
		}
		double finalans = ((double)fuel*velocities[ans])/consumptions[ans];
		return finalans;
	}
}