# 🧠 arquiapi — Estimador de Edad según tu nombre vía Agify.io

Este proyecto es una API REST construida con **Java + Spring Boot** que permite estimar la edad de una persona a partir de su nombre, usando el servicio externo [Agify.io](https://agify.io).

---

## 🎯 Objetivos del Proyecto

✅ Conectar una API externa (Agify.io) desde Spring Boot  
✅ Construir una arquitectura limpia con controladores, servicios y modelos  
✅ Aplicar buenas prácticas de desarrollo con Maven y Lombok  
✅ Integrar CI/CD con GitHub Actions 
---

## 🚀 ¿Qué hace esta API?

| Endpoint | Método | Descripción |
|----------|--------|-------------|
| `/api/age?name=nombre` | GET | Estima la edad a partir del nombre usando Agify.io |

---

## ⚙️ Cómo ejecutar el proyecto localmente

### 🧱 Requisitos
- Java 21+
- Maven
- VS Code o cualquier otro IDE
- Conexión a Internet para consumir la API externa

### 📦 Clona el repositorio

```bash
git clone https://github.com/niabnn/arquiapi.git
cd arquiapi
```

### ▶️ Ejecuta la API

```bash
./mvnw spring-boot:run
```

### 🌐 Prueba el endpoint

Puedes usar Postman o simplemente un navegador para probar:

#### Estimar edad

```
GET http://localhost:8080/api/age?name=estefania
```

📷 *Ejemplo de respuesta:*

```json
{
  "name": "estefania",
  "age": 45
}
```

---

## 🔄 CI/CD con GitHub Actions

Este proyecto incluye un workflow para **Integración Continua** usando **GitHub Actions**.

📁 Archivo:

```
.github/workflows/maven.yml
```

Cada vez que haces un push a `main`, se ejecuta el build automáticamente:

```yaml
- name: Build with Maven
  run: mvn clean install
```

📷 *Aqui dejo una captura del pipeline exitoso en GitHub Actions:*

![GitHub Actions](https://drive.google.com/uc?export=view&id=1lkdrwzf42KKb6nZ7hvHMmeSi74LOKERX)

---
## 🧠 ¿Qué aprendí haciendo esto?

* Cómo consumir APIs externas desde Java usando `RestTemplate`
* Separar capas (Controller, Service, Model) con responsabilidad única
* Uso de Lombok para simplificar clases DTO
* Automatización de compilación con GitHub Actions
---

## 📚 Recursos utilizados

* [Material de clase](https://drive.google.com/file/d/1ziF3GamOvXJGt8-745fLf4mcCOB6hD2m/view?usp=sharing)
* [Agify.io](https://agify.io)
* [Spring Initializr](https://start.spring.io/)
* [GitHub Actions](https://docs.github.com/en/actions)
* [Lombok](https://projectlombok.org/)
---

## 👩‍💻 Autora

**Estefanía G.**  
Estudiante de Ingeniería de Sistemas  
[GitHub: @niabnn](https://github.com/niabnn)
