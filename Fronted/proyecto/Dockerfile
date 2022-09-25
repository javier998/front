# Stage 1
FROM node as node
WORKDIR /app
COPY package.json /app
RUN npm install
COPY . /app
RUN npm run build --prod
CMD ["npm", "start"]
# Stage 2
FROM nginx:alpine
COPY --from=node /app/dist/proyecto /usr/share/nginx/html