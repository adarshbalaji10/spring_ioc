package spring_ioc_ac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Mobile1 {
public static void main(String[] args) {
//	MusicPlayer musicPlayer=new MusicPlayer();
//	musicPlayer.startMusic();
	
	
//	//loading xml file to container
//	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("iocac.xml");
//	
//	// calling getBean() to get instance/object/Bean
//	MusicPlayer musicPlayer= (MusicPlayer) applicationContext.getBean("mp");
//	musicPlayer.startMusic();
//	MusicPlayer musicPlayer1= (MusicPlayer) applicationContext.getBean("mp");
//	musicPlayer1.startMusic();
//	Whatsapp  whatsapp=(Whatsapp) applicationContext.getBean("wa");
//	whatsapp.send();
//	
	
	
//	//finding xml file
	ClassPathResource classPathResource= new ClassPathResource("iocac.xml");
	// loading xml file
	BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
	//calling getBean()
	MusicPlayer musicPlayer= (MusicPlayer) beanFactory.getBean("mp");
	musicPlayer.startMusic();
	
	
	
	
	
	
}
}
