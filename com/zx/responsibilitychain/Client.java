package com.zx.responsibilitychain;

/**
 * 责任链模式，改变if else分支时某些地方改变的情况
 */
public class Client {

	public static void main(String[] args) {
		//创建一个请求
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);

		//创建相关的审批人
		DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
		CollegeApprover collegeApprover = new CollegeApprover("李院长");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");


		//需要将各个审批级别的下一个设置好 (处理人构成环形: )
		//因为可能某些1000块直接让校长处理，如果有环形就给环形的下一个处理
		//但其实这个例子，校长应该直接可以批任何金额的条子吧。也不能一个级别只能批固定size吧
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);



		departmentApprover.processRequest(purchaseRequest);
		viceSchoolMasterApprover.processRequest(purchaseRequest);
	}

}
