# AI-Powered Brand Tweet Generator (Java)

A full-stack starter project using Java 17, Spring Boot, HTML/CSS/JavaScript, and the OpenAI Responses API. It generates a brand voice summary and 10 original tweets.

## Features

- Responsive input form
- Brand name, industry, objective, product details, tone, audience
- Optional user-supplied example posts
- Java REST endpoint with validation
- AI-generated voice summary and exactly 10 requested tweet ideas
- Download generated result as `.txt`
- API key kept in an environment variable
- Basic API error handling

## Requirements

- JDK 17 or later
- Maven 3.6+
- OpenAI API key with API access and available credits/billing

## Run locally

### 1. Set your API key

Windows Command Prompt:
```bat
set OPENAI_API_KEY=your_real_api_key
```

Windows PowerShell:
```powershell
$env:OPENAI_API_KEY="your_real_api_key"
```

macOS/Linux:
```bash
export OPENAI_API_KEY="your_real_api_key"
```

Replace the placeholder with your real key. Never commit it to GitHub or paste it into frontend code.

Optional model override:
```bash
# Windows Command Prompt
set OPENAI_MODEL=gpt-4.1-mini

# PowerShell
$env:OPENAI_MODEL="gpt-4.1-mini"

# macOS/Linux
export OPENAI_MODEL="gpt-4.1-mini"
```

### 2. Start the application

From the folder containing `pom.xml`:
```bash
mvn spring-boot:run
```

Open http://localhost:8080 in your browser.

The frontend is served by Spring Boot from `src/main/resources/static/index.html`.
The frontend calls `POST /api/generate`, and the Java backend calls `https://api.openai.com/v1/responses`.

## Build a JAR

```bash
mvn clean package
java -jar target/brand-tweet-generator-1.0.0.jar
```

## Example tests

### Sportswear brand
- Brand: Nike
- Industry: Sportswear
- Objective: Engagement
- Products: Running shoes and sports apparel
- Tone: Bold and confident
- Audience: Runners and fitness enthusiasts

### Food delivery brand
- Brand: Zomato
- Industry: Food delivery
- Objective: Engagement
- Products: Online food ordering and delivery
- Tone: Funny and witty
- Audience: Food lovers, students, and working professionals

Examples are test inputs only. Generated examples should not be represented as official posts from these brands.

## Deployment

Deploy the Maven/Spring Boot application to a Java-compatible hosting service that supports environment variables and an HTTP port. Configure:
- `OPENAI_API_KEY` with your secret API key
- `PORT` if the platform provides a port variable (the app uses 8080 by default)
- Optionally `OPENAI_MODEL`

Test the deployed URL and API before sharing it. Hosting providers and free tiers change; verify the provider's current Java deployment support and pricing.

## API endpoint

`POST /api/generate`

Example JSON body:
```json
{
  "brandName": "Sample Brand",
  "industry": "Food",
  "objective": "Engagement",
  "productDetails": "A local bakery selling bread and cakes",
  "tone": "Friendly and conversational",
  "targetAudience": "Families and students",
  "referencePosts": ""
}
```

Response:
```json
{
  "result": "## Brand Voice Summary..."
}
```

## Limitations and future improvements

- This version uses prompt-based inference and optional user-supplied posts; it does not automatically scrape X, Instagram, or LinkedIn.
- Review generated content for factual accuracy before publishing.
- Future additions could include editable tweet cards, per-tweet regeneration, CSV export, social API integrations, and automated quality checks.

## Project structure

```text
brand-tweet-generator-java/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/com/example/brandtweet/
        │   ├── BrandTweetGeneratorApplication.java
        │   ├── controller/BrandTweetController.java
        │   ├── model/GenerateRequest.java
        │   ├── model/GenerateResponse.java
        │   └── service/BrandTweetService.java
        └── resources/
            ├── application.properties
            └── static/index.html
```
