from question1 import get_city_weather

def test_get_city_weather():
  assert get_city_weather("Quito") == "22 degrees and sunny" 

  assert get_city_weather("New York") == "14 degrees and rainy"
  
  # test
  print(get_city_weather("Quito"))
  print(get_city_weather("New York"))

#add main
test_get_city_weather()
