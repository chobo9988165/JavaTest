package com.test.java.dummy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JScrollBar;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.test.data.Item;

public class Ex76 {
	
	public static void main(String[] args) {
		
		//Ex76.java
		
		//OpenAPI, Open Application Programming Interface
		//- 공개된 프로그래밍 기능
		//- 공공 데이터 포털
		//- 구글, 아마존, 네이버, 다음 등 에서도 제공
		
		//OpenAPI > 데이터 확보 > 전부 진짜 데이터
		//XML, JSON
		//JSON은 독립적
		
		
		m1();
		//m2();
		
	}//main

	private static void m2() {
		
		/*
		 * 
		 * 
		 * {
		 * 		"name" : "홍길동"
		 * 		"age"  : "20"
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
//		String json = "{\r\n"
//				+"	\"name""홍길동"\r\n"
//				+"	\"age": 20;"
//				+"	"tel" + [ "010-1111-1111", "010-2222-2222", "010-3333-3333"]"
//				+"      }";
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONObject obj = (JSONObject)parser.parse(json);
			parser.parse(json);
			
			System.out.println(obj.get("name"));
			System.out.println(obj.get("age"));
			//System.out.println(obj.get("tel"));
			
			JSONArray arr = (JSONArray)obj.get("tel");
			
			for (Object t : arr) {
				System.out.println((t);
			}
			
			
		} catch (Exception e) {
			System.out.println("at Ex76.m2");
			e.printStackTrace();
		}
				
		
		
		
	}

	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[지하철 정보 검색]");
		
		System.out.print("역검색: ");
		
		String name = scan.nextLine();
		
		
		//1. 요청 URL 만들기
		String ur1 = "http://apis.data.go.kr/1613000/SubwayInfoService/getKwrdFndSubwaySttnList?";
		
		
		ur1 += "ServiceKey=FH9RXhxxS5S0L2sa3FNzgmpbDTlz0bRa9ZxLaErjCH%2FW9sYiE1TnP%2Fa2PI5%2BvtfefUy81IoyLl9nREfdRVn%2BMA%3D%3D";
		
		ur1 += "&_type=json"; // XML or JSON
		
		ur1 += "&numOfRows=10";
		
		ur1 += "&pageNo=1";
		
		ur1 += "&subwayStationName=" + URLEncoder.encode(name);
		
		//System.out.println(ur1);
		//QueryString
//		? 키=데이터&키=데이터
//		JSON name:홍길동 nick:[도둑]
		
		
		
		
		
		//URL 객체 생성
		try {
			
			URL obj_url = new URL(ur1);
			
			//URL와 연결하는 객체 생성 > 브라우저 대신 접속(커넥션 객체)
			HttpURLConnection conn
				= (HttpURLConnection)obj_url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Contetent-type", "application/josn");
			
			BufferedReader reader = null;
			
			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			
			//reader > 검색 결과 읽기 가능
//			String line = null;
//			
//			while ((line = reader.readLine()) != null) {
//				System.out.println(line);
//			}
			
			JSONParser parser = new JSONParser();
			
			JSONObject root = (JSONObject)parser.parse(reader);
			
			JSONObject response = (JSONObject)root.get("response");
			
			JSONObject body = (JSONObject)response.get("body");
			
			JSONObject items = (JSONObject)body.get("items");
			
			ArrayList<String> temp = new ArrayList<String>();
			
			
			if (items.get("item") instanceof JSONObject) {
				
				JSONObject item = (JSONObject)items.get("item");
				
				System.out.println("1. ");
				System.out.println("호선: " + item.get("subwayRouteName"));
				System.out.println("역명: " + item.get("subwayStationName"));
				
				temp.add(item.get("subwayStationId").toString());
				
			} else {
				
				JSONArray arr = (JSONArray)items.get("item");
				
				int n = 1;
				
				for (Object obj : arr) {
					
					JSONObject item = (JSONObject)obj;
					
					System.out.println(n + ".");
					System.out.println("호선: " + item.get("subwayRouteName"));
					System.out.println("역명: " + item.get("subwayStationName"));
					System.out.println("----------");
					n++;
					
					temp.add(item.get("subwayStationId").toString());
				}
				
				
			}
			

			
			
			
			
			reader.close();
			conn.disconnect();
			
			
			System.out.println("============");
			System.out.print("역 선택: ");
			int se1 = scan.nextInt();
			
			System.out.println(temp.get(se1 - 1));//역 ID
		
			
			
			ur1 = "http://apis.data.go.kr/1613000/SubwayInfoService/getSubwaySttnExitAcctoBusRouteList?";
			
			
			ur1 += "ServiceKey=FH9RXhxxS5S0L2sa3FNzgmpbDTlz0bRa9ZxLaErjCH%2FW9sYiE1TnP%2Fa2PI5%2BvtfefUy81IoyLl9nREfdRVn%2BMA%3D%3D";
			
			ur1 += "&_type=json"; // XML or JSON
			
			ur1 += "&numOfRows=10";
			
			ur1 += "&pageNo=1";
			
			ur1 += "&subwayStationId=" + temp.get(se1 - 1);

			
			obj_url = new URL(ur1);
			
			//URL와 연결하는 객체 생성 > 브라우저 대신 접속(커넥션 객체)
			conn
				= (HttpURLConnection)obj_url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Contetent-type", "application/josn");
			
			reader = null;
			
			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			
			root = (JSONObject)parser.parse(reader);
			
			response = (JSONObject)root.get("response");
			
			body = (JSONObject)response.get("body");
			
			items = (JSONObject)body.get("items");

			
			if (items.get("item") instanceof JSONObject) {
				
				JSONObject item = (JSONObject)items.get("item");
				
				System.out.println("출구: " + item.get("exitNo") + "번");
				System.out.println("주변시설: " + item.get("dirDesc"));
				
			} else {
				
				JSONArray arr = (JSONArray)items.get("item");
				
				for (Object obj : arr) {
					
					JSONObject item = (JSONObject)obj;
					
					System.out.println("출구: " + item.get("exitNo") + "번");
					System.out.println("주변시설: " + item.get("dirDesc"));
				}//for
				
			}
			

			
			
			
			
			reader.close();
			conn.disconnect();

			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
