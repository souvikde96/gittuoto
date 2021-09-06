System.setProperty("webdriver.chrome.driver", "C:\\Users\\jupiter\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());//validate title webpage
		System.out.println( driver.getCurrentUrl());//validate if landed correct url
		System.out.println(driver.getPageSource());
		driver.get("https://yahoo.com");
		//driver.navigate().back();
		driver.close();
