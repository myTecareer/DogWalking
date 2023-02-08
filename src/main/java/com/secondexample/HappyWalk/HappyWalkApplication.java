package com.secondexample.HappyWalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HappyWalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappyWalkApplication.class, args);
//		ConfigurableApplicationContext configurableApplicationContext=
//		SpringApplication.run(SeconddemoApplication.class, args);
//		UserRepository userRepository =
//				configurableApplicationContext.getBean(UserRepository.class);
//		PostRepository postRepository =
//				configurableApplicationContext.getBean(PostRepository.class);
//		Post firstPost = new Post("Dublin1","hello, here is description1");
//		Post secondPost = new Post("Dublin3","hello, here is description2");
////		postRepository.save(firstPost);
////		postRepository.save(secondPost);
//		List<Post> postList = Arrays.asList(firstPost, secondPost);
//		User user = new User("user1");
//		user.setPostList(postList);
//		userRepository.save(user);

	}

}
