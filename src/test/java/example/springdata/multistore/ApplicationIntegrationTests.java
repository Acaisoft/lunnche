/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.springdata.multistore;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Integration test to show the usage of repositories backed by different stores.
 * 
 * @author Oliver Gierke
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationIntegrationTests {

//	@Autowired PersonRepository personRepository;
//	@Autowired TreasureRepository treasureRepository;
//
//	@Test
//	public void useMultipleRepositories() {
//
//		personRepository.save(new Person("Frodo", "Baggins", 21, "a"));
//		personRepository.save(new Person("Bilbo", "Baggins", 43, "a"));
//
//		for (Person person : personRepository.findAll()) {
//			log.info("Hello " + person.toString());
//		}
//
//		treasureRepository.deleteAll();
//		treasureRepository.save(new Treasure("Sting", "Made by the Elves"));
//		treasureRepository.save(new Treasure("Sauron's ring", "One ring to rule them all"));
//
//		for (Treasure treasure : treasureRepository.findAll()) {
//			log.info("Found treasure " + treasure.toString());
//		}
//	}
}