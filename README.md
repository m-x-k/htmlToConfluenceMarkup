# HTML input to confluence markup

Simple app to convert html file into Confluence content using the eclipse mylyn.doc api.

## Requirements

* Java 8+

## Setup

Checkout this repository locally and navigate to the following folder on the command line. Execute:

```
./gradlew clean build
```

## Example usage

`java -jar ./build/libs/htmlToConfluenceMarkup.jar /tmp/test.html > /tmp/output.txt`
