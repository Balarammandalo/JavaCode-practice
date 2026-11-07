package com.kodewala.returnexp;

public class ReturnStatement {
	public static void main(String[] args) {
		String[] amazonProducts = {
			    "Apple iPhone 14 (128GB) - Midnight",
			    null,
			    "Sony WH-1000XM5 Wireless Noise Cancelling Headphones",
			    "Dell Inspiron 15 Laptop (Intel i5, 16GB RAM, 512GB SSD)",
			    "HP Pavilion Gaming Laptop",
			    "boAt Rockerz 450 Bluetooth Headphones",
			    "Amazon Echo Dot (5th Gen) Smart Speaker with Alexa",
			    "Fire-Boltt Ninja Call Pro Smart Watch",
			    "OnePlus Nord CE 3 Lite 5G",
			    "Logitech Wireless Mouse M185",
			    "Canon EOS 1500D DSLR Camera",
			    "Mi 10000mAh Power Bank 3i",
			    "Apple MacBook Air M1",
			    "Samsung 55-inch Crystal 4K UHD Smart TV",
			    "Philips Air Fryer HD9200",
			    "Prestige Electric Kettle PKOSS",
			    "Noise ColorFit Pulse Grand Smart Watch",
			    "Lenovo Tab M10 HD Tablet",
			    "JBL Flip 5 Portable Bluetooth Speaker",
			    "ASUS ROG Strix Gaming Laptop"
			};
		for(int i=0;i<amazonProducts.length;i++) {
			String currProduct = amazonProducts[i];
			if(currProduct == null ) {
				System.out.println("Null product is founded");
				return;
			}
			System.out.println(currProduct.toUpperCase());
		}
	}
}
