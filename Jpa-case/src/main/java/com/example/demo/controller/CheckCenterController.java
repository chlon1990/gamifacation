//package com.example.demo.controller;
//
//import java.io.IOException;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//@RestController
//public class CheckCenterController {
//
//	// 页面请求
//	@GetMapping("/websocket/{cid}")
//	public ModelAndView socket(@PathVariable String cid) {
//		ModelAndView mav = new ModelAndView("/websocket");
//		mav.addObject("cid", cid);
//		return mav;
//	}
//
//	// 推送数据接口
//	@ResponseBody
//	@RequestMapping("/websocket/push/{cid}")
//	public String pushToWeb(@PathVariable String cid, String message) {
//		try {
//			WebSocketServer.sendInfo(message, cid);
//		} catch (IOException e) {
//			e.printStackTrace();
//			return (cid + "#" + e.getMessage());
//		}
//		return cid;
//	}
//}