package com.lelai.sales.common;

import com.lelai.sales.domain.modules.SysUser;
import com.lelai.sales.domain.modules.TXfile;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 用户工具类
 * @author TBM
 * @version 2013-12-05
 */
public class UserUtils {


	public static final String USER_CACHE = "userCache";
	public static final String USER_CACHE_ID_ = "id_";
	public static final String USER_CACHE_LOGIN_NAME_ = "ln";
	public static final String USER_CACHE_LIST_BY_OFFICE_ID_ = "oid_";
	public static final String USER_CACHE_LIST_BY_ROLE_ID_ = "rid_";

	public static final String CACHE_ROLE_LIST = "roleList";
	public static final String CACHE_MENU_LIST = "menuList";
	public static final String CACHE_AREA_LIST = "areaList";
	public static final String CACHE_OFFICE_LIST = "officeList";
	public static final String CACHE_OFFICE_ALL_LIST = "officeAllList";
	
	/**
	 * 根据ID获取用户
	 * @param id
	 * @return 取不到返回null
	 */
	public static SysUser get(String id){

		return null;
	}

	/**
	 * 清除当前用户缓存
	 */
	public static void clearCache(){

		UserUtils.clearCache(getUser());
	}
	
	/**
	 * 清除指定用户缓存
	 * @param user
	 */
	public static void clearCache(SysUser user){

	}
	
	/**
	 * 获取当前用户
	 * @return 取不到返回 new User()
	 */
	public static SysUser getUser(){

		return null;
	}
	
	public static String getTime(Date date){
		StringBuffer time = new StringBuffer();
        Date date2 = new Date();
        long temp = date2.getTime() - date.getTime();    
        long days = temp / 1000 / 3600/24;                //相差小时数
        if(days>0){
        	time.append(days+"天");
        }
        long temp1 = temp % (1000 * 3600*24);
        long hours = temp1 / 1000 / 3600;                //相差小时数
        if(days>0 || hours>0){
        	time.append(hours+"小时");
        }
        long temp2 = temp1 % (1000 * 3600);
        long mins = temp2 / 1000 / 60;                    //相差分钟数
        time.append(mins + "分钟");
        return  time.toString();
	}

	public static String getFormatDate(Date date){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		return sf.format(date);
	}

	public static int tryParseInteger(String str){
		int result = 0;
		try{
			result = Integer.valueOf(str);
		}catch (Exception e){}
		return result;
	}

	/**
	 * 从表单中解析出文件并序列化
	 * @param file
	 * @return
	 */
	public static TXfile parseFile(MultipartFile file){
		TXfile xfile = null;
		if (file!= null && !file.isEmpty()) {
			// 文件保存路径
			String realPath = "/mnt_ext/lelai/" + "xfile/contrast";

			// 创建目录
			if (!realPath.endsWith(File.separator)) {
				realPath = realPath + File.separator;
			}
			File descDir = new File(realPath);
			if (descDir.exists()==false) {
				descDir.mkdirs();
			}

			xfile = new TXfile();
			try {
				String originalName = file.getOriginalFilename();
				String suffix = originalName.substring(originalName.lastIndexOf("."));
				String name = UUID.randomUUID().toString().substring(0, 9).replace("-", "") + suffix;
				String xpath = name;
				int size = (int) file.getSize();
				File target = new File(realPath + name);
				target.createNewFile();

				OutputStream os = new FileOutputStream(target);
				IOUtils.copy(file.getInputStream() ,os);

				//file.transferTo(target);

				//保存图片信息t_xfile
				xfile.setName(name);
				xfile.setOname(originalName);
				xfile.setPath("/xfile/contrast/" + xpath);
				xfile.setIsImage(1);
				xfile.setType(suffix);
				xfile.setSize(size);
				xfile.setContentType("images/" + suffix);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return xfile;
	}

}
