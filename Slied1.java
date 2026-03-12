package Slide1;

import java.util.ArrayList;

public class Slied1 {
	public static void main(String[] args) {
		ArrayList<Animal> listAnimal = new ArrayList<Animal>();
		listAnimal.add(new Dog("Cậu Vàng",4));
		listAnimal.add(new Cat("Con Mèo",2));
		for(Animal a : listAnimal) {
			a.eat();
			a.sleep();
			if(a instanceof Dog d) {
				d.bark();
			}else if(a instanceof Cat c) {
				c.meow();
			}
			
		}
//		MayTinh mayTinh = new MayTinh();
//		System.out.println(mayTinh.tinhTong(3, 5));
//		System.out.println(mayTinh.tinhTong(3.5, 5));
//		System.out.println(mayTinh.tinhTong(3, 5,6));
//		System.out.println("24 PS48501 Nguyen Tan Loc");
//		Xe xe = new Xe();
//		xe.setHangXe("Toyota");
//		xe.setNamSanXuat(2026);
//		System.out.println(xe.toString());
//		
//		Xe xe2 = new Xe("Honda",2000);
//		System.out.println(xe2.toString());
	}
}
