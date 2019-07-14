package com.psx.controller;
import java.io.File;
import java.io.IOException;
import java.util.*;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import util.poi.POIIntoUtil;
import util.poi.Person;


@Controller
@RequestMapping("/base")
public class POIController {
	@RequestMapping(value = "/import", method = RequestMethod.POST)
	public String importExcel(@RequestParam("file") MultipartFile multipartfile, Map<String, Object> reqScopeMap) throws InvalidFormatException, InstantiationException, IllegalAccessException, IOException {
		System.out.println("上传成功");
		if (!multipartfile.isEmpty()) {
			CommonsMultipartFile commonsmultipartfile = (CommonsMultipartFile) multipartfile;
			DiskFileItem diskFileItem = (DiskFileItem) commonsmultipartfile.getFileItem();
			File file = diskFileItem.getStoreLocation();
				reqScopeMap.put("poiexcel", POIIntoUtil.importExcel(file, Person.class));

		}
		System.out.println(reqScopeMap.get("poiexcel").toString());

			return "ok";
		}

}
