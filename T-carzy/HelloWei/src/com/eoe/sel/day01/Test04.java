package com.eoe.sel.day01;

import com.eoe.sel.day01.entity.Person1;
import com.eoe.sel.day01.entity.Student;
import com.eoe.sel.day01.entity.Teacher;




public class Test04 {

	public static void main(String[] args) {
			Person1 [] p1=new Person1[4];
			p1[0]=new Student("梁文峰",'女',2222,2222.2222,"娇弱的","eoe极客工作坊","1205班");
			p1[1]=new Teacher("张飞",'女',1111,111.1111,"飘逸的","eoe极客工作坊","1205班");
			p1[2]=new Student("张菲菲",'男',3333,3333.3333,"狂野的","eoe极客工作坊","1205班");
			p1[3]=new Person1("皮卡丘",'男',1,1.1,"变异的") {
				String unit="动物演绎学院";
				String worker="受气包";
				@Override
				public void doing() {
					System.out.println(this.name+"正在挨打，准备放电");
				}
				public void say(){
					super.say();
					System.out.println("俺在"+unit+"当"+worker);
				}
			};
			for(Person1 p:p1){
				p.say();
				p.doing();
				System.out.println("0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0");
			}
	}

}
