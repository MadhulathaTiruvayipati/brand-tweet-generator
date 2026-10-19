# Approach Document — AI-Powered Brand Tweet Generator

## Objective
Create a simple full-stack tool that accepts brand information and returns a 3–4 bullet brand voice summary and 10 original tweets.

## Architecture
- Frontend: HTML, CSS, and JavaScript
- Backend: Java 17 and Spring Boot
- AI: OpenAI Responses API
- Build: Maven

The browser sends form data to `POST /api/generate`. Spring Boot validates the input and constructs a prompt. The backend calls the AI API using a server-side secret and returns the generated text to the browser. The browser displays the result and supports downloading it.

## Brand voice analysis
The first version uses prompt-based inference from the brand name, industry, objective, product details, preferred tone, target audience, and optional example posts. The app does not claim to analyze live social media. User-supplied posts are used only as style references.

## Prompt design
The prompt defines the AI role, passes the brand inputs, requests tone/audience/personality/themes, requires exactly 10 distinct tweets, and asks for a mix of conversational, promotional, witty, and informative styles. It discourages unsupported claims, repetitive ideas, and copying reference posts.

## Security
The API key is read from the `OPENAI_API_KEY` environment variable on the backend. It is not included in browser JavaScript or committed source files.

## Limitations
Brand tone is inferred, not verified against current official social posts. Generated copy should be reviewed before publishing. API usage may incur charges.

## Future improvements
Add approved social account integrations, tweet-by-tweet regeneration, edit/copy controls, CSV export, and automated checks for tweet count and length.
