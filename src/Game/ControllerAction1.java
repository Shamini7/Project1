package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import Game.DataBean;
import Game.ResultProcessor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ControllerAction1 extends ActionSupport{

	private String choice;
	private DataBean databean;
	
	public DataBean getData(){
		   return databean;
    }
			
	public void setData(DataBean databean){
		   this.databean = databean;
    }
	
	public String getChoice(){
		return choice;
	}
	
	public void setChoice(String choice){
		this.choice = choice;
	}
	
	
	public String execute() throws Exception {
		
		System.out.println("1---->in action class");
		
		//DataBean db =  new DataBean();
		ResultProcessor rp = new ResultProcessor();
		DataBean db = rp.compute(getChoice());

		Map<String, Object> sessionMap = ServletActionContext.getContext().getSession();
		sessionMap.put("DataBeanSession", db);
		
	
		
		System.out.println("2--->in action class");
		int result = db.getResult();
		
		System.out.println("Result after computation--->" +result);
		
		
		 if(result == 0){
		    	return "failure";
		 }
		 else if(result == 1){
			 return "success";
		 }
		 else 
		     return "draw";
		}
		
	}
	
