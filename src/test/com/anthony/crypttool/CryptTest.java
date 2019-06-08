package test.com.anthony.crypttool; 

import com.anthony.crypttool.Crypt;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* Crypt Tester. 
* 
* @author <Authors name> 
* @since <pre>Jun 8, 2019</pre> 
* @version 1.0 
*/ 
public class CryptTest {
    Crypt crypt = new Crypt();

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: generateSymetricKey(String algorithm, String keyLength) 
* 
*/ 
@Test
public void testGenerateSymetricKey() throws Exception {
    String key = this.crypt.generateSymetricKey("AES","256");
}

/** 
* 
* Method: calculateHash(String msg, String hashAlgorithm) 
* 
*/ 
@Test
public void testCalculateHash() throws Exception { {
    assertEquals("2e99758548972a8e8822ad47fa1017ff72f06f3ff6a016851f45c398732bc5c",
            this.crypt.calculateHash("this is a test","SHA-256"));
}
}

} 
