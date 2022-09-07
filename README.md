# Project Overview
Docker image of Spring Boot app using Jib

# Container Registry Login (Local)
export CR_PAT=YOUR_TOKEN

echo $CR_PAT | docker login ghcr.io -u USERNAME --password-stdin

CR_PAT holds the PAT (token created in GitHub: read, write & delete:packages perms)

# Build and Push Image Locally to GitHub Package Container
gradle jib --image=ghcr.io/aam134134/spring-jib
