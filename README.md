# Palindrome

![Build Status](https://github.com/pavelKomiss121/mp-12/actions/workflows/gradle.yml/badge.svg)
    
Необходимо было написать программу, которая реализует проверку строки на палиндром
Реализацию необходимо найти на githaub и stackoverflow

Также было необходимо полноценно его протестировать, используя навыки поиска информации и применения найденных решений.

В качестве поиска реализации проверки на палиндром был выполнен запрос на stackoverflow:

``[java] PalindromeChecker is:accepted score:3``

Для тестов необходимо было добавить зависимость для assertJ, поэтому в браузере был выполнен запрос:

``build.gradle assertJ dependencies``

В чем заключаются тесты:

Тест проверки палиндрома - базовые случаи
- Тесты с обычными словами

Тест проверки палиндрома - особые случаи
- Тесты со служебными символами
- Тесты с пробелами
- Тесты со словами на англ. языке

Тест проверки палиндрома - граничные случаи
- Тесты с цифрами

Также возникла ошибка:

``Error: Gradle script '/home/runner/work/up-12/up-12/gradlew' is not executable. ``

Чтобы найти решение, я ввел запрос в браузере:
``site:stackoverflow.com graddle.yml Error: Gradle script gradlew is not executable.``
