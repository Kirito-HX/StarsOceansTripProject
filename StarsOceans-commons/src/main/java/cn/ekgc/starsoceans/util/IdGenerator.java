package cn.ekgc.starsoceans.util;

import org.springframework.stereotype.Component;

import java.security.MessageDigest;

/**
 * <b>星海-基础架构-主键生成器</b>
 * <p>
 *    数据库所有数据不再使用主键自增长策略，而是通过本生成器生成主键进行插入
 * </p>
 * @author HuangXi
 * @version 1.0.0
 * @since 1.0.0
 */
@Component("idGenerator")
public class IdGenerator {
	private static final String KEY_MD5 = "MD5";
	/**
	 * <b>生成主键</b>
	 * <p>
	 *     通过获得当前时间戳后，使用 MD5 对其进行加密<br/>
	 *     该方法属于线程同步的
	 * </p>
	 * @return
	 * @throws Exception
	 */
	public synchronized String createId() throws Exception{
		// 获得当前时间戳，并且转换为String
		String currentTimeMillis = String.valueOf(System.currentTimeMillis());
		// 对当前时间毫秒数使用 MD5 加密
		StringBuffer sb = new StringBuffer();
		try {
			MessageDigest md = MessageDigest.getInstance(KEY_MD5);
			byte[] inputData =currentTimeMillis.getBytes("UTF-8");
			byte[] encryptionData = md.digest(inputData);
			for (int i = 0; i < encryptionData.length; i++) {
				int value = ((int) encryptionData[i]) & 0xff;
				if (value < 16) {
					sb.append("0");
				}
				sb.append(Integer.toHexString(value));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString().toUpperCase();
	}
}
