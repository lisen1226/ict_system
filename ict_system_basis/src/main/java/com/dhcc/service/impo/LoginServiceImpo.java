package com.dhcc.service.impo;

import java.security.MessageDigest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.mapper.PersonnelMapper;
import com.dhcc.pojo.HistoryexamsExample;
import com.dhcc.pojo.Personnel;
import com.dhcc.service.LoginService;

@Service
public class LoginServiceImpo implements LoginService {

	@Autowired
	private PersonnelMapper personnelMapper;
	@Override
	public Personnel checkLogin(String unumber, String password) {
		String md5Password = getMD5(password);
		Personnel peason = personnelMapper.checkLogin(unumber, md5Password);
		if (peason==null) {
			peason = personnelMapper.checkLoginByPhone(unumber, md5Password);
		}
		return peason;
	}
	
	public static String getMD5(String s) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};       
 
        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
}
