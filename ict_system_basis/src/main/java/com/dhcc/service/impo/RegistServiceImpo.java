package com.dhcc.service.impo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.mapper.PersonnelMapper;
import com.dhcc.pojo.Personnel;
import com.dhcc.pojo.PersonnelExample;
import com.dhcc.service.RegistService;

@Service
public class RegistServiceImpo implements RegistService {

	@Autowired
	private PersonnelMapper personnelMapper;

	@Override
	public int userRegisted(Personnel person) {
		// 设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		// new Date()为获取当前系统时间
		String time = df.format(new Date());
		person.setRegistrationtime(time);
		String password = person.getPassword();
		person.setPassword(getMD5(password));
		return personnelMapper.insert(person);
	}

	@Override
	public int verifyExitByUnumber(String unumber) {
		PersonnelExample example = new PersonnelExample();
		example.createCriteria().andUnumberEqualTo(unumber);
		int exam = personnelMapper.countByExample(example);
		return exam;
	}

	@Override
	public int verifyExitByPhone(String phone) {
		PersonnelExample example = new PersonnelExample();
		example.createCriteria().andPhoneEqualTo(phone);
		int exam = personnelMapper.countByExample(example);
		return exam;
	}

	 
    
    /**
     * 对字符串md5加密(大写+数字)
     *
     * @param str 传入要加密的字符串
     * @return  MD5加密后的字符串
     */
    
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
