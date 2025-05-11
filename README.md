# architecture-bionicpro

## Запуск проекта

```bash
docker compose up --build -d
```

## Учетные данные

### Пользователь с ролью `prothetic_user`

- **Email:** `prothetic1@example.com`
- **Пароль:** `prothetic123`

### Пользователь без роли `prothetic_user`

- **Email:** `user1@example.com`
- **Пароль:** `password123`

## Изменения

- Добавлен backend-сервис `api`, написанный на Java с использованием Spring Boot.
- Добавлен дополнительный сервис `localhost` для устранения проблем взаимодействия Spring-приложения и Keycloak в Docker-окружении ¯\\\_(ツ)_/¯
- Во фронте изменён `ReactKeycloakProvider` в `App.tsx` для поддержки **PKCE**.
- Реализована логика скачивания отчёта.
- Добавлена кнопка **Logout** для удобного переключения пользователей.

## Проверка функциональности

### Сценарий №1 (разрешённый доступ)

1. Перейти на [http://localhost:3000](http://localhost:3000)
2. Войти с учетными данными `prothetic1@example.com`
3. Нажать кнопку **Download report**
4. Отчёт должен успешно скачаться

### Сценарий №2 (запрещённый доступ)

1. Нажать **Logout**
2. Перейти на [http://localhost:3000](http://localhost:3000)
3. Войти с учетными данными `user1@example.com`
4. Нажать кнопку **Download report**
5. Скачивание не происходит — в DevTools видна ошибка **403 Forbidden**