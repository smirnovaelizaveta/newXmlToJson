# language: ru
Функция: Конвертирование xml в json

  Структура сценария: Конвертирование xml в json
    Пусть на вход конвертера подан файл <путь до файла>
    Тогда результат содержит подстроку <подстрока>
    Примеры:
      | путь до файла                                     | подстрока                                           |
      | "src\\test\\resources\\xmlExamples\\Example1.xml" | "src\\test\\resources\\jsonExamples\\Example1.json" |
      | "src\\test\\resources\\xmlExamples\\Example2.xml" | "src\\test\\resources\\jsonExamples\\Example2.json" |
      | "src\\test\\resources\\xmlExamples\\Example3.xml" | "src\\test\\resources\\jsonExamples\\Example3.json" |
