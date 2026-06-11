# Implementación de un Sistema de Notificaciones Reactivas

El sistema de notificaciones debe procesar eventos provenientes de múltiples orígenes (usuarios, sistemas de monitoreo, alertas de seguridad) y enviar notificaciones a través de diferentes canales (email, SMS, push notifications). El sistema debe mantener la resiliencia, escalabilidad y confiabilidad del código, manejando flujos de eventos de manera eficiente y asegurando que las notificaciones se envíen de forma idempotente y consistente.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Reactiva |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del Sistema de Notificaciones

**Objetivo:** Establecer la funcionalidad básica del sistema de notificaciones para procesar y enviar eventos de un origen.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar y configurar un origen de eventos.
- Implementar la recepción y procesamiento de eventos.
- Enviar notificaciones a través de un canal definido.
- Asegurar que el envío de notificaciones sea idempotente.

**Entregable:** Sistema de notificaciones que procesa eventos de un origen y envía notificaciones a través de un canal.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar diferentes tipos de eventos y asegurar la idempotencia en el envío de notificaciones.

</details>

### Fase 2: Integración de Múltiples Orígenes de Eventos

**Objetivo:** Extender el sistema para manejar eventos provenientes de múltiples orígenes y asegurar la consistencia y escalabilidad.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Integrar dos orígenes adicionales de eventos al sistema.
- Asegurar que el sistema maneje la consistencia y escalabilidad al procesar eventos de múltiples orígenes.
- Implementar mecanismos para manejar la carga y evitar sobrecargas.

**Entregable:** Sistema de notificaciones que procesa eventos de tres orígenes diferentes y envía notificaciones a través de un canal.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo balancear la carga y asegurar la consistencia al integrar múltiples orígenes de eventos.

</details>

### Fase 3: Implementación de Mecanismos de Resiliencia

**Objetivo:** Fortalecer el sistema con mecanismos de resiliencia para manejar fallos y asegurar la confiabilidad.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementar mecanismos de resiliencia para manejar fallos en los orígenes de eventos y en los canales de notificación.
- Asegurar que el sistema pueda recuperarse de fallos y continuar operando de manera confiable.
- Evaluar y ajustar la configuración del sistema para mejorar la resiliencia.

**Entregable:** Sistema de notificaciones resiliente que puede manejar fallos en los orígenes de eventos y canales de notificación y continuar operando de manera confiable.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo implementar retry, fallback y circuit breaker para manejar fallos y asegurar la resiliencia del sistema.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la programación reactiva y cómo se aplica en el sistema de notificaciones?
- **paraQueSirve**: ¿Para qué sirve la programación reactiva en el contexto del sistema de notificaciones?
- **comoSeUsa**: ¿Cómo se usan los operadores de Project Reactor en el sistema de notificaciones?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar un sistema de notificaciones reactivo y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de mecanismos de resiliencia en el sistema de notificaciones?

## Criterios de Evaluacion

- Implementación de un sistema de notificaciones que procesa eventos de múltiples orígenes.
- Envío de notificaciones idempotente y consistente.
- Integración de mecanismos de resiliencia para manejar fallos y asegurar la confiabilidad.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
