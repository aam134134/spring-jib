# Project Overview
Docker image of Spring Boot app using Jib

# Container Registry Login (Local)
export CR_PAT=YOUR_TOKEN

echo $CR_PAT | docker login ghcr.io -u USERNAME --password-stdin

CR_PAT holds the PAT (token created in GitHub: read, write & delete:packages perms)

# Build and Push Image Locally to GitHub Package Container
gradle jib --image=ghcr.io/aam134134/spring-jib

# Gotcha
Run the GitHub [workflow action](https://github.com/aam134134/spring-jib/blob/main/.github/workflows/gradle-jib.yml) and have it setup the Docker image package in the Container Registry before pushing any 'local' images, otherwise the package will not be configured properly and the automated workflow will fail to push the image.
