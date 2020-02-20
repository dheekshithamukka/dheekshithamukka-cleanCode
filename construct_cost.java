package com.epam.cleancode;

public class construct_cost {
	double t_area;
	  int std;
	  boolean f_a_h;
	  construct_cost(double t_area,int std,boolean f_a_h)
	  {
		  this.t_area=t_area;
		  this.std=std;
		  this.f_a_h=f_a_h;
	  }
	  double estimate()
	  {
		  double result=0;
		  if(std==1) result=1200*t_area;
		  else if(std==2) result=1500*t_area;
		  else if(std==3)
		  {
			  if(f_a_h) result=2500*t_area;
			  else result=1800*t_area;
		  }
		  return result;
	  }
}
